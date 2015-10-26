.class final Loe;
.super Lua;
.source "PG"


# instance fields
.field private synthetic a:Lod;


# direct methods
.method constructor <init>(Lod;)V
    .locals 0

    .prologue
    .line 240
    iput-object p1, p0, Loe;->a:Lod;

    invoke-direct {p0}, Lua;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltz;Luh;)V
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Loe;->a:Lod;

    invoke-virtual {v0}, Lod;->a()V

    .line 244
    return-void
.end method

.method public final a(Luh;)V
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Loe;->a:Lod;

    invoke-virtual {v0}, Lod;->dismiss()V

    .line 259
    return-void
.end method

.method public final b(Ltz;Luh;)V
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Loe;->a:Lod;

    invoke-virtual {v0}, Lod;->a()V

    .line 249
    return-void
.end method

.method public final c(Ltz;Luh;)V
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Loe;->a:Lod;

    invoke-virtual {v0}, Lod;->a()V

    .line 254
    return-void
.end method
