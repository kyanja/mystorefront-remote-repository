package de.hybris.merchandise.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class CustomSearchResultUnitVariantProductPopulator extends SearchResultVariantProductPopulator {

    @Override
    public void populate(SearchResultValueData source, ProductData target) {

        super.populate(source, target);

        // populate unit property values
        target.setUnit(this.<String> getValue(source, "unit"));
    }
}
