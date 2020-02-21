package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class AllFieldCases  {

	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	String id;


	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String name;


	@GraphQLInputParameters(names = {"uppercase", "textToAppendToTheForname"}, types = {"Boolean", "String"})
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String forname;


	@GraphQLInputParameters(names = {"unit"}, types = {"Unit"})
	@GraphQLScalar(graphQLTypeName = "Long", javaClass = Long.class)
	Long age;


	@GraphQLScalar(graphQLTypeName = "Date", javaClass = Date.class)
	Date date;


	@JsonDeserialize(contentAs = Date.class)
	@GraphQLScalar(graphQLTypeName = "Date", javaClass = Date.class)
	List<Date> dates;


	@GraphQLScalar(graphQLTypeName = "Int", javaClass = Integer.class)
	Integer nbComments;


	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	List<String> comments;


	@JsonDeserialize(contentAs = Boolean.class)
	@GraphQLScalar(graphQLTypeName = "Boolean", javaClass = Boolean.class)
	List<Boolean> booleans;


	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	List<String> aliases;


	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	List<String> planets;


	@JsonDeserialize(contentAs = Human.class)
	@GraphQLNonScalar(graphQLTypeName = "Human", javaClass = Human.class)
	List<Human> friends;


	@GraphQLNonScalar(graphQLTypeName = "AllFieldCasesWithIdSubtype", javaClass = AllFieldCasesWithIdSubtype.class)
	AllFieldCasesWithIdSubtype oneWithIdSubType;


	@GraphQLInputParameters(names = {"nbItems", "date", "dates", "uppercaseName", "textToAppendToTheForname"}, types = {"Long", "Date", "Date", "Boolean", "String"})
	@JsonDeserialize(contentAs = AllFieldCasesWithIdSubtype.class)
	@GraphQLNonScalar(graphQLTypeName = "AllFieldCasesWithIdSubtype", javaClass = AllFieldCasesWithIdSubtype.class)
	List<AllFieldCasesWithIdSubtype> listWithIdSubTypes;


	@GraphQLInputParameters(names = {"input"}, types = {"FieldParameterInput"})
	@GraphQLNonScalar(graphQLTypeName = "AllFieldCasesWithoutIdSubtype", javaClass = AllFieldCasesWithoutIdSubtype.class)
	AllFieldCasesWithoutIdSubtype oneWithoutIdSubType;


	@GraphQLInputParameters(names = {"nbItems", "input", "textToAppendToTheForname"}, types = {"Long", "FieldParameterInput", "String"})
	@JsonDeserialize(contentAs = AllFieldCasesWithoutIdSubtype.class)
	@GraphQLNonScalar(graphQLTypeName = "AllFieldCasesWithoutIdSubtype", javaClass = AllFieldCasesWithoutIdSubtype.class)
	List<AllFieldCasesWithoutIdSubtype> listWithoutIdSubTypes;



	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}

	public String getForname() {
		return forname;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getAge() {
		return age;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setNbComments(Integer nbComments) {
		this.nbComments = nbComments;
	}

	public Integer getNbComments() {
		return nbComments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setBooleans(List<Boolean> booleans) {
		this.booleans = booleans;
	}

	public List<Boolean> getBooleans() {
		return booleans;
	}

	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}

	public List<String> getAliases() {
		return aliases;
	}

	public void setPlanets(List<String> planets) {
		this.planets = planets;
	}

	public List<String> getPlanets() {
		return planets;
	}

	public void setFriends(List<Human> friends) {
		this.friends = friends;
	}

	public List<Human> getFriends() {
		return friends;
	}

	public void setOneWithIdSubType(AllFieldCasesWithIdSubtype oneWithIdSubType) {
		this.oneWithIdSubType = oneWithIdSubType;
	}

	public AllFieldCasesWithIdSubtype getOneWithIdSubType() {
		return oneWithIdSubType;
	}

	public void setListWithIdSubTypes(List<AllFieldCasesWithIdSubtype> listWithIdSubTypes) {
		this.listWithIdSubTypes = listWithIdSubTypes;
	}

	public List<AllFieldCasesWithIdSubtype> getListWithIdSubTypes() {
		return listWithIdSubTypes;
	}

	public void setOneWithoutIdSubType(AllFieldCasesWithoutIdSubtype oneWithoutIdSubType) {
		this.oneWithoutIdSubType = oneWithoutIdSubType;
	}

	public AllFieldCasesWithoutIdSubtype getOneWithoutIdSubType() {
		return oneWithoutIdSubType;
	}

	public void setListWithoutIdSubTypes(List<AllFieldCasesWithoutIdSubtype> listWithoutIdSubTypes) {
		this.listWithoutIdSubTypes = listWithoutIdSubTypes;
	}

	public List<AllFieldCasesWithoutIdSubtype> getListWithoutIdSubTypes() {
		return listWithoutIdSubTypes;
	}

    public String toString() {
        return "AllFieldCases {"
				+ "id: " + id
				+ ", "
				+ "name: " + name
				+ ", "
				+ "forname: " + forname
				+ ", "
				+ "age: " + age
				+ ", "
				+ "date: " + date
				+ ", "
				+ "dates: " + dates
				+ ", "
				+ "nbComments: " + nbComments
				+ ", "
				+ "comments: " + comments
				+ ", "
				+ "booleans: " + booleans
				+ ", "
				+ "aliases: " + aliases
				+ ", "
				+ "planets: " + planets
				+ ", "
				+ "friends: " + friends
				+ ", "
				+ "oneWithIdSubType: " + oneWithIdSubType
				+ ", "
				+ "listWithIdSubTypes: " + listWithIdSubTypes
				+ ", "
				+ "oneWithoutIdSubType: " + oneWithoutIdSubType
				+ ", "
				+ "listWithoutIdSubTypes: " + listWithoutIdSubTypes
        		+ "}";
    }
}
