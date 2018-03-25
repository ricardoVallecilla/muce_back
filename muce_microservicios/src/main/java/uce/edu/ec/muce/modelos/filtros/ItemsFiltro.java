package uce.edu.ec.muce.modelos.filtros;

public class ItemsFiltro {
	
	private Long museoId;
	private Long grupoId;
	private Long categoriaId;
	private int pagina;
	private int registros;
	private String texto;
	
	public Long getMuseoId() {
		return museoId;
	}
	public void setMuseoId(Long museoId) {
		this.museoId = museoId;
	}
	public Long getGrupoId() {
		return grupoId;
	}
	public void setGrupoId(Long grupoId) {
		this.grupoId = grupoId;
	}
	public Long getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	public int getRegistros() {
		return registros;
	}
	public void setRegistros(int registros) {
		this.registros = registros;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
