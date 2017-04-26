package ua.galicia.flowershop.dao;
 
import ua.galicia.flowershop.entity.Product;
import ua.galicia.flowershop.model.PaginationResult;
import ua.galicia.flowershop.model.FlowerInfo;
 
public interface ProductDAO {
 
    
    
    public Product findFlower(String code);
    
    public FlowerInfo findFlowerInfo(String code) ;
  
    
    public PaginationResult<FlowerInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<FlowerInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(FlowerInfo productInfo);
    
}