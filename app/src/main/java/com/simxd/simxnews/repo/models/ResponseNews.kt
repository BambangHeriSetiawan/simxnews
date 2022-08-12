package com.simxd.simxnews.repo.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class ResponseNews(

	@field:SerializedName("copyright")
	val copyright: String? = null,

	@field:SerializedName("response")
	val response: Response? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class KeywordsItem(

	@field:SerializedName("major")
	val major: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("value")
	val value: String? = null
) : Parcelable

@Parcelize
data class PersonItem(

	@field:SerializedName("firstname")
	val firstname: String? = null,

	@field:SerializedName("role")
	val role: String? = null,

	@field:SerializedName("qualifier")
	val qualifier: String? = null,

	@field:SerializedName("organization")
	val organization: String? = null,

	@field:SerializedName("middlename")
	val middlename: String? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("lastname")
	val lastname: String? = null
) : Parcelable

@Parcelize
data class Byline(

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("person")
	val person: List<PersonItem?>? = null,

	@field:SerializedName("organization")
	val organization: String? = null
) : Parcelable

@Parcelize
data class Headline(

	@field:SerializedName("sub")
	val sub: String? = null,

	@field:SerializedName("content_kicker")
	val contentKicker: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("main")
	val main: String? = null,

	@field:SerializedName("seo")
	val seo: String? = null,

	@field:SerializedName("print_headline")
	val printHeadline: String? = null,

	@field:SerializedName("kicker")
	val kicker: String? = null
) : Parcelable

@Parcelize
data class MultimediaItem(

	@field:SerializedName("legacy")
	val legacy: Legacy? = null,

	@field:SerializedName("subtype")
	val subtype: String? = null,

	@field:SerializedName("crop_name")
	val cropName: String? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("caption")
	val caption: String? = null,

	@field:SerializedName("subType")
	val subType: String? = null,

	@field:SerializedName("credit")
	val credit: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
) : Parcelable

@Parcelize
data class DocsItem(

	@field:SerializedName("snippet")
	val snippet: String? = null,

	@field:SerializedName("keywords")
	val keywords: List<KeywordsItem?>? = null,

	@field:SerializedName("section_name")
	val sectionName: String? = null,

	@field:SerializedName("abstract")
	val jsonMemberAbstract: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("uri")
	val uri: String? = null,

	@field:SerializedName("news_desk")
	val newsDesk: String? = null,

	@field:SerializedName("pub_date")
	val pubDate: String? = null,

	@field:SerializedName("multimedia")
	val multimedia: List<MultimediaItem?>? = null,

	@field:SerializedName("word_count")
	val wordCount: Int? = null,

	@field:SerializedName("lead_paragraph")
	val leadParagraph: String? = null,

	@field:SerializedName("type_of_material")
	val typeOfMaterial: String? = null,

	@field:SerializedName("web_url")
	val webUrl: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("subsection_name")
	val subsectionName: String? = null,

	@field:SerializedName("headline")
	val headline: Headline? = null,

	@field:SerializedName("byline")
	val byline: Byline? = null,

	@field:SerializedName("document_type")
	val documentType: String? = null,

	@field:SerializedName("print_page")
	val printPage: String? = null,

	@field:SerializedName("print_section")
	val printSection: String? = null
) : Parcelable

@Parcelize
data class Response(

	@field:SerializedName("docs")
	val docs: List<DocsItem?>? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null
) : Parcelable

@Parcelize
data class Meta(

	@field:SerializedName("hits")
	val hits: Int? = null,

	@field:SerializedName("offset")
	val offset: Int? = null,

	@field:SerializedName("time")
	val time: Int? = null
) : Parcelable

@Parcelize
data class Legacy(

	@field:SerializedName("widewidth")
	val widewidth: Int? = null,

	@field:SerializedName("wideheight")
	val wideheight: Int? = null,

	@field:SerializedName("wide")
	val wide: String? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("thumbnailwidth")
	val thumbnailwidth: Int? = null,

	@field:SerializedName("thumbnailheight")
	val thumbnailheight: Int? = null,

	@field:SerializedName("xlarge")
	val xlarge: String? = null,

	@field:SerializedName("xlargewidth")
	val xlargewidth: Int? = null,

	@field:SerializedName("xlargeheight")
	val xlargeheight: Int? = null
) : Parcelable