package dev.enricogollner.projValorTotalPedido;

import dev.enricogollner.projValorTotalPedido.entities.Order;
import dev.enricogollner.projValorTotalPedido.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ProjValorTotalPedidoApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ProjValorTotalPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Código do produto:");
		int code = sc.nextInt();

		System.out.println("Valor base:");
		double basic = sc.nextDouble();

		System.out.println("Percentual de desconto:");
		double discount = sc.nextDouble();
		if (discount < 0 || discount > 100) {
			throw new IllegalAccessException("O desconto deve ser entre 0 e 100%");
		}

		Order order = new Order(code, basic, discount);
		double total = orderService.total(order);
		System.out.printf("Pedido código: %d%n", order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", total);

		sc.close();
	}
}
