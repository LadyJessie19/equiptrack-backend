package br.com.teacup.resources;

import java.util.List;

import br.com.teacup.model.Equipamento;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/equipamentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EquipamentoResource {

    @GET
    public List<Equipamento> getAll() {
        return Equipamento.listAll();
    }

    @POST
    @Transactional
    public Response create(Equipamento equipamento) {
        equipamento.persist();
        return Response.status(Response.Status.CREATED).entity(equipamento).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        Equipamento equipamento = Equipamento.findById(id);
        if (equipamento == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(equipamento).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, Equipamento updatedEquipamento) {
        Equipamento equipamento = Equipamento.findById(id);
        if (equipamento == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        equipamento.nome = updatedEquipamento.nome;
        equipamento.serialNumber = updatedEquipamento.serialNumber;
        equipamento.localizacao = updatedEquipamento.localizacao;
        equipamento.riscoPontuacao = updatedEquipamento.riscoPontuacao;
        return Response.ok(equipamento).build();
    }

    @PATCH
    @Path("/{id}")
    @Transactional
    public Response partialUpdate(@PathParam("id") Long id, Equipamento updatedFields) {
        Equipamento equipamento = Equipamento.findById(id);
        if (equipamento == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        if (updatedFields.nome != null) {
            equipamento.nome = updatedFields.nome;
        }
        if (updatedFields.serialNumber != null) {
            equipamento.serialNumber = updatedFields.serialNumber;
        }
        if (updatedFields.localizacao != null) {
            equipamento.localizacao = updatedFields.localizacao;
        }
        if (updatedFields.riscoPontuacao != null) {
            equipamento.riscoPontuacao = updatedFields.riscoPontuacao;
        }
        return Response.ok(equipamento).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        Equipamento equipamento = Equipamento.findById(id);
        if (equipamento == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        equipamento.delete();
        return Response.noContent().build();
    }
}
