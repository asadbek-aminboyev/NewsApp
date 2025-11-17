package com.loc.newsapp.data.remote.dbo

import com.loc.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)