package devopsdistilled.operp.server.context;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import devopsdistilled.operp.server.data.service.items.BrandService;
import devopsdistilled.operp.server.data.service.items.ItemService;
import devopsdistilled.operp.server.data.service.items.ProductService;
import devopsdistilled.operp.server.data.service.stock.StockService;
import devopsdistilled.operp.server.data.service.stock.WarehouseService;

@Configuration
public class RmiContext {
	@Inject
	private ItemService itemService;

	@Inject
	private ProductService productService;

	@Inject
	private BrandService brandService;
	
	@Inject 
	private StockService stockService;
	
	@Inject
	private WarehouseService warehouseService;

	@Bean
	public RmiServiceExporter rmiItemServiceExporter() {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setServiceName("ItemService");
		rmiServiceExporter.setServiceInterface(ItemService.class);
		rmiServiceExporter.setService(itemService);
		rmiServiceExporter.setRegistryPort(1099); // default
		return rmiServiceExporter;
	}

	@Bean
	public RmiServiceExporter rmiProductServiceExporter() {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setServiceName("ProductService");
		rmiServiceExporter.setServiceInterface(ProductService.class);
		rmiServiceExporter.setService(productService);
		rmiServiceExporter.setRegistryPort(1099);
		return rmiServiceExporter;
	}

	@Bean
	public RmiServiceExporter rmiBrandServiceExporter() {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setServiceName("BrandService");
		rmiServiceExporter.setServiceInterface(BrandService.class);
		rmiServiceExporter.setService(brandService);
		rmiServiceExporter.setRegistryPort(1099);
		return rmiServiceExporter;
	}
	
	@Bean
	public RmiServiceExporter rmiStockServiceExporter(){
		RmiServiceExporter rmiServiceExportor=new RmiServiceExporter();
		rmiServiceExportor.setServiceName("StockService");
		rmiServiceExportor.setServiceInterface(StockService.class);
		rmiServiceExportor.setService(stockService);
		rmiServiceExportor.setRegistryPort(1099);
		return rmiServiceExportor;
		
	}
	
	@Bean
	public RmiServiceExporter rmiWarehouseServiceExporter(){
		RmiServiceExporter rmiServiceExporter=new RmiServiceExporter();
		rmiServiceExporter.setServiceName("WarehouseService");
		rmiServiceExporter.setServiceInterface(WarehouseService.class);
		rmiServiceExporter.setService(warehouseService);
		rmiServiceExporter.setRegistryPort(1099);
		return rmiServiceExporter;
	}
}
