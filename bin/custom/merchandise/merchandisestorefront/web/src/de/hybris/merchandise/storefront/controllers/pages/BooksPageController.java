git package de.hybris.merchandise.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("tenant")
@RequestMapping("/books")
public class BooksPageController extends AbstractPageController {

    private static final String BOOK_CMS_PAGE = "booksCMSPage";

    @RequestMapping(method = RequestMethod.GET)
    public String getOffers(final Model model) throws CMSItemNotFoundException
    {
        final ContentPageModel booksCMSPage = getContentPageForLabelOrId(BOOK_CMS_PAGE);
        storeCmsPageInModel(model, booksCMSPage);
        setUpMetaDataForContentPage(model, booksCMSPage);
        return getViewForPage(model);
    }

}
