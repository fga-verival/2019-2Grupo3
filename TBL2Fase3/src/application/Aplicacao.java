package application;

public class Aplicacao {
		
		private Integer qtdDias; // quantidade de dias
		private Float aplicacaoInicial; // aplicacao inicial
		private Float taxaJurosAnual; // taxa de juros anual
		private Float aliquotaImpostoRenda; // aliquiota
		
		public Aplicacao(Integer qtdDias, Float aplicacaoInicial, Float taxaJurosAnual, Float aliquotaImpostoRenda) {
			this.qtdDias = qtdDias;
			this.aplicacaoInicial = aplicacaoInicial;
			this.taxaJurosAnual = taxaJurosAnual / 100f; // dividindo para obter a porcentagem
			this.aliquotaImpostoRenda = aliquotaImpostoRenda / 100f; // dividindo para obter a porcentagem
		}

		public Integer getQtdDias() {
			return qtdDias;
		}

		public void setQtdDias(Integer qtdDias) {
			this.qtdDias = qtdDias;
		}

		public Float getAplicacaoInicial() {
			return aplicacaoInicial;
		}

		public void setAplicacaoInicial(Float aplicacaoInicial) {
			this.aplicacaoInicial = aplicacaoInicial;
		}

		public Float getTaxaJurosAnual() {
			return taxaJurosAnual;
		}

		public void setTaxaJurosAnual(Float taxaJurosAnual) {
			this.taxaJurosAnual = taxaJurosAnual;
		}

		public Float getAliquotaImpostoRenda() {
			return aliquotaImpostoRenda;
		}

		public void setAliquotaImpostoRenda(Float aliquotaImpostoRenda) {
			this.aliquotaImpostoRenda = aliquotaImpostoRenda;
		}

		public float calcularRendimentoBruto() {
			float rb = 0;
			float periodo = qtdDias / 365f;
			
			rb = periodo * aplicacaoInicial * taxaJurosAnual;
			return rb;
		}

		public float calcularImpostoDeRenda() {
			return 3.14f;
		}
		
		

}
