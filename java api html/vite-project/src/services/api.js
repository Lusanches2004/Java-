import axios from 'axios';

const apiClient = axios.create({
    baseURL: 'https://Localhost:8080',
    timeout: 5000,
});