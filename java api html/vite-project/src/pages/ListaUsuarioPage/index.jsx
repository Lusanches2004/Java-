import'./style.css';
import api from'../../services/api';
import { toast } from 'react-toastify';
import { use, useEffect, useState } from 'react';


export default function ListaUsuarioPage() {
    const [usuarios, setUsuarios] = useState([]);
    const [estaCarregando, setEstaCarregando] = useState(true);

    useEffect(() => {
        async function buscarUsuarios() {
            try {
                const resposta = await api.get('/usuários');
                setUsuarios(resposta.data);
        } catch (erro) {
            console.error('Erro ao buscar usuários:', erro);
            const mensagemDeErro = erro.response?.data?.mensagem || 'Erro ao buscar a lista de usuários.';
                toast.error(mensagemDeErro);
            }  finally {
                setEstaCarregando(false);
            }
            
        }
        
        buscarUsuarios();
            },{});

            if(carregando) {
                return <div>Carregando usuários...</div>;
            }
    
            