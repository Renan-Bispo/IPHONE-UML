package repositories;

import models.Page;

public interface BrowserInternet {
    void displayPage(Page page);
    void newTab(Page page);
    Page updatePage(Page oldPage, Page newPage);
}
