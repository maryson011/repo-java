async function findCountry(region, keyword) {
    const bUrl = 'https://jsonmock.hackerrank.com/api/countries/search'
    let page = 1
    let lugares = []
    
    while (true) {
        const resposta = await axios.get(`${bUrl}?region=${region}&name=${keyword}&page=${page}`)
        const data = resposta.data
        
        lugares = lugares.concat(data.data)
        
        if (page >= data.total_pages) {
            break
        }
        page++
    }
    
    const resultado = lugares.map(country => {
        return {
            name: country.name,
            population: country.population
        }
    })
    
    resultado.sort((a,b) => {
        if (a.population === b.population) {
            return a.name.localeCompare(b.name)
        }
        return a.population - b.population
    })
    
    const output = resultado.map(country => `${country.name},${country.population}`)
    return output
}