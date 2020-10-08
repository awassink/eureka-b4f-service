package nl.quintor.minor.cnsd.blok1.b4fservice;

import com.netflix.appinfo.AmazonInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableFeignClients
public class B4fServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(B4fServiceApplication.class, args);
	}

	@Bean
	@Profile("aws")
	public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
		EurekaInstanceConfigBean eurekaInstanceConfigBean = new EurekaInstanceConfigBean(inetUtils);
		AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
		eurekaInstanceConfigBean.setDataCenterInfo(info);
		eurekaInstanceConfigBean.setHostname(info.get(AmazonInfo.MetaDataKey.localHostname));
		eurekaInstanceConfigBean.setIpAddress(info.get(AmazonInfo.MetaDataKey.localIpv4));
		return eurekaInstanceConfigBean;
	}

}
