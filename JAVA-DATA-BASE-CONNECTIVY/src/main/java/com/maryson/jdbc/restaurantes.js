async function getVoteCount(cityName, estimatedCost) {
    const url = `https://jsonmock.hackerrank.com/api/food_outlets?city=${cityName}&estimated_cost=${estimatedCost}`
    
    try {
        const response = await axios.get(url)
        const data = response.data
        
        if (data.data.length === 0) {
            return -1
        }
        
        let totalVotos = data.data.reduce((s, o) => s + o.user_rating.votes, 0)
        
        return totalVotos
    } catch (e) {
        console.error("Error", e)
        return -1
    }

}