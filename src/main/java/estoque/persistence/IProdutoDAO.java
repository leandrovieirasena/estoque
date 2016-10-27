package estoque.persistence;

import java.sql.SQLException;
import java.util.List;

import estoque.model.Produto;

public interface IProdutoDAO {

	public void adicionar( Produto prod ) throws SQLException;
	public void excluir( Produto prod ) throws SQLException;
	public Produto alterar( int codigo ) throws SQLException;
	public List<Produto> listarProdutos(  ) throws SQLException;
	
}
