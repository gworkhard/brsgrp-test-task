import models.ResultItem;
import models.SearchResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class TaskTestCase {

    private final String API_BASE = "https://docs.microsoft.com";
    private final String TEST_WORD = "LINQ";
    private final int MAX_RESULTS = 25;
    private RestTemplate restTemplate;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void testFirstPartSearchResults() {
        testSearchResultTitlesByResultNumbers(0, MAX_RESULTS);
    }

    @Test
    public void testSecondPartSearchResults() {
        testSearchResultTitlesByResultNumbers(25, MAX_RESULTS);
    }

    public void testSearchResultTitlesByResultNumbers(int skip, int resultNumber) {
        String url = API_BASE + String.format("/api/search?search=%s&locale=ru-ru&facet=category&$skip=%d&$top=%d", TEST_WORD, skip, resultNumber );
        SearchResult searchResult = restTemplate.getForObject(url, SearchResult.class);
        assertNotNull(searchResult);
        for (ResultItem resultItem : searchResult.getResults()) {
            assertTrue("Result with title '" + resultItem.getTitle() + "' doesn't contain " + TEST_WORD,
                    resultItem
                            .getTitle()
                            .toLowerCase()
                            .contains(TEST_WORD.toLowerCase()));
        }
    }
}
