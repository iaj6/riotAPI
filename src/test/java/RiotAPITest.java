import com.com.ijones.jsonmapper.RiotAPI;
import com.com.ijones.jsonmapper.RiotServerReqest;
import com.ijones.riotpojos.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ijones
 * Date: 12/11/13
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class RiotAPITest {
    RiotAPI riotAPI;
    long summonerID;
    String testSummonerName = "TheOddOne";
    long testSummonerID = 60783;

    @Before
    public void setUp() throws Exception {
        riotAPI = new RiotAPI("na", 0);
        summonerID = riotAPI.getSummonerByName(testSummonerName).getId();
        riotAPI.setID(summonerID);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllChampionsInstance() throws Exception {
        ChampionList championList = riotAPI.getChampionList();
        for (Champion champ : championList.getChampions())
            System.out.println(champ.getName());
    }

    @Test
    public void testGetAllChampion() throws Exception {
        RiotServerReqest.getAllChampions("na");
    }

    @Test
    public void testGetGameInstance() throws Exception {
        RecentGames recentGames = riotAPI.getRecentGames();

        for (Game game : recentGames.getGames()) {
            System.out.println(game.getGameMode());
            for (Player player : game.getFellowPlayers())
                System.out.println(player.getSummonerId());
        }

    }

    @Test
    public void testGetRecentGame() throws Exception {
        RiotServerReqest.getRecentGame("na", testSummonerID);
    }

    @Test
    public void testGetLeagueInstance() throws Exception {
        Map<String, League> league = riotAPI.getLeague();

        System.out.println(league.toString());
    }

    @Test
    public void testGetLeague() throws Exception {
        // VoyBoy's ID: 22097256
        RiotServerReqest.getLeague("na", 22097256);
    }

    @Test
    public void testGetSummaryStatsInstance() throws Exception {
        PlayerStatsSummaryList playerStatsSummaryList = riotAPI.getSummaryStats();

        for (PlayerStatsSummary playerStatsSummary : playerStatsSummaryList.getPlayerStatSummaries()) {
            System.out.println(playerStatsSummary.getPlayerStatSummaryType());
            for (AggregatedStat aggregatedStat : playerStatsSummary.getAggregatedStats())
                System.out.println(aggregatedStat.getName());
        }

    }

    @Test
    public void testGetStatsRankedInstance() throws Exception {
        RankedStats rankedStats = riotAPI.getRankedStats();

        for (ChampionStats championStats : rankedStats.getChampions()) {
            System.out.println(championStats.getName());
            for (ChampionStat championStat : championStats.getStats())
                System.out.println(championStat.getName());
        }

    }

    @Test
    public void testGetSummaryStats() throws Exception {
        RiotServerReqest.getStats("na", 60783, RiotServerReqest.STATS_OPTIONS.SUMMARY);
    }

    @Test
    public void testGetRankedStats() throws Exception {
        RiotServerReqest.getStats("na", 60783, RiotServerReqest.STATS_OPTIONS.RANKED);
    }

    @Test
    public void testGetSummonerRunes() throws Exception {
        RunePages runePages = riotAPI.getSummonersRunes();

        for (RunePage runePage : runePages.getPages()) {
            System.out.println(runePage.getName());
            for (RuneSlot runeSlot : runePage.getSlots()) {
                System.out.println(runeSlot.getRuneSlotId());
                System.out.println(runeSlot.getRune().getDescription());
            }
        }
    }

    @Test
    public void testGetSummonerMasteries() throws Exception {
        MasteryPages masteryPages = riotAPI.getSummonersMasteries();

        for (MasteryPage masteryPage : masteryPages.getPages()) {
            System.out.println(masteryPage.getName());
            for (Talent talent : masteryPage.getTalents())
                System.out.println(talent.getName());
        }
    }

    @Test
    public void testGetSummonerByNameInstance() throws Exception {
        Summoner summoner = riotAPI.getSummonerByName(testSummonerName);
        System.out.println("Summoner's Name is: " + summoner.getName());

    }

    @Test
    public void testGetSummonerByName() throws Exception {
        RiotServerReqest.getSummonerByName("na", testSummonerName);

    }

    @Test
    public void testGetSummonerNameListByIDs() throws Exception {
        String summerIDList = "60783,22097256";
        SummonerNameList summonerNameList = riotAPI.getSummonerNameListByIDs(summerIDList);

        for(SummonerName summonerName : summonerNameList.getSummoners())
            System.out.println(summonerName.getName());
    }

    @Test
    public void testGetTeamInstance() throws Exception {
        List<Team> teamList = riotAPI.getTeam();

        System.out.println(teamList.toString());
        for (Team team : teamList) {
            System.out.println(team.getName());
            if (team.getMatchHistory() != null)
                System.out.println(team.getMatchHistory().size());
            else
                System.out.println("No Match History");
        }
    }

    @Test
    public void testGetTeam() throws Exception {
        RiotServerReqest.getTeam("na", testSummonerID);

    }
}
