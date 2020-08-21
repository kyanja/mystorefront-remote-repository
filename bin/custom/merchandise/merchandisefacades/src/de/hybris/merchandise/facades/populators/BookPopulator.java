package de.hybris.merchandise.facades.populators;


import de.hybris.merchandise.core.model.BookModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;

import de.hybris.platform.core.model.product.ProductModel;

import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import de.hybris.platform.variants.model.VariantProductModel;


public class BookPopulator implements Populator<ProductModel, ProductData> {


    @Override
    public void populate(final ProductModel source, final ProductData target) throws ConversionException {


        final ProductModel baseProduct = getBaseProduct(source);

        if (baseProduct instanceof BookModel)
        {
            final BookModel bookModel = (BookModel) baseProduct;

            target.setAlias(bookModel.getAlias());
        }


    }

    protected ProductModel getBaseProduct(final ProductModel productModel)
    {
        ProductModel currentProduct = productModel;
        while (currentProduct instanceof VariantProductModel)
        {
            final VariantProductModel variant = (VariantProductModel) currentProduct;
            currentProduct = variant.getBaseProduct();
        }
        return currentProduct;
    }
}






