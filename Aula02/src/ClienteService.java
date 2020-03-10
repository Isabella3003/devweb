public class ClienteService {
	
	private ClienteDAO dao;
	
	public ClienteService() {
		dao = new ClienteDAO();
	}
	
	public void criar(Cliente cli) {
		cli.setId(dao.criar(cli.getNome(), cli.getFone(), cli.getEmail()));
	}

	public void atualizar(Cliente cli) {
		dao.atualizar(cli.getId(), cli.getNome(), cli.getFone(), cli.getEmail());
	}

	public void excluir(Cliente cli) {
		dao.excluir(cli.getId());
	}

	public void carregar(Cliente cli) {
		Cliente aux = dao.carregar(cli.getId());
		cli.setId(aux.getId());
		cli.setNome(aux.getNome());
		cli.setFone(aux.getFone());
		cli.setEmail(aux.getEmail());
		
	}
}
