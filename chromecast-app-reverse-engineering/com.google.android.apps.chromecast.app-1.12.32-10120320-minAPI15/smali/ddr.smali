.class public Lddr;
.super Lddh;
.source "PG"


# instance fields
.field public a:Lddq;

.field private final b:Lddq;

.field private c:Z


# direct methods
.method public constructor <init>(Lddq;)V
    .locals 1

    .prologue
    .line 159
    invoke-direct {p0}, Lddh;-><init>()V

    .line 160
    iput-object p1, p0, Lddr;->b:Lddq;

    .line 161
    sget v0, Lddt;->e:I

    invoke-virtual {p1, v0}, Lddq;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lddq;

    iput-object v0, p0, Lddr;->a:Lddq;

    .line 162
    const/4 v0, 0x0

    iput-boolean v0, p0, Lddr;->c:Z

    .line 163
    return-void
.end method

.method private b(Lddn;Lddp;)Lddr;
    .locals 4

    .prologue
    .line 241
    const/4 v2, 0x0

    .line 2222
    :try_start_0
    iget-object v0, p0, Lddr;->b:Lddq;

    .line 244
    invoke-virtual {v0}, Lddq;->f()Ldee;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ldee;->a(Lddn;Lddp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lddq;
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 250
    if-eqz v0, :cond_0

    .line 251
    invoke-virtual {p0, v0}, Lddr;->a(Lddq;)Lddr;

    .line 254
    :cond_0
    return-object p0

    .line 246
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 3038
    :try_start_1
    iget-object v0, v1, Lddx;->a:Ldea;

    .line 247
    check-cast v0, Lddq;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 248
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 250
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 251
    invoke-virtual {p0, v1}, Lddr;->a(Lddq;)Lddr;

    :cond_1
    throw v0

    .line 250
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method

.method private e()Lddr;
    .locals 2

    .prologue
    .line 192
    .line 1222
    iget-object v0, p0, Lddr;->b:Lddq;

    .line 193
    invoke-virtual {v0}, Lddq;->g()Lddr;

    move-result-object v0

    .line 194
    invoke-direct {p0}, Lddr;->f()Lddq;

    move-result-object v1

    invoke-virtual {v0, v1}, Lddr;->a(Lddq;)Lddr;

    .line 195
    return-object v0
.end method

.method private f()Lddq;
    .locals 2

    .prologue
    .line 200
    iget-object v0, p0, Lddr;->a:Lddq;

    sget v1, Lddt;->d:I

    invoke-virtual {v0, v1}, Lddq;->a(I)Ljava/lang/Object;

    .line 201
    const/4 v0, 0x1

    iput-boolean v0, p0, Lddr;->c:Z

    .line 202
    iget-object v0, p0, Lddr;->a:Lddq;

    return-object v0
.end method


# virtual methods
.method public final synthetic a()Lddh;
    .locals 1

    .prologue
    .line 149
    invoke-direct {p0}, Lddr;->e()Lddr;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lddn;Lddp;)Lddh;
    .locals 1

    .prologue
    .line 149
    invoke-direct {p0, p1, p2}, Lddr;->b(Lddn;Lddp;)Lddr;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lddq;)Lddr;
    .locals 2

    .prologue
    .line 216
    invoke-virtual {p0}, Lddr;->b()V

    .line 217
    iget-object v0, p0, Lddr;->a:Lddq;

    sget v1, Lddt;->c:I

    invoke-virtual {v0, v1, p1}, Lddq;->a(ILjava/lang/Object;)Ljava/lang/Object;

    .line 218
    return-object p0
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 170
    iget-boolean v0, p0, Lddr;->c:Z

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lddr;->a:Lddq;

    sget v1, Lddt;->e:I

    invoke-virtual {v0, v1}, Lddq;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lddq;

    .line 172
    sget v1, Lddt;->c:I

    iget-object v2, p0, Lddr;->a:Lddq;

    invoke-virtual {v0, v1, v2}, Lddq;->a(ILjava/lang/Object;)Ljava/lang/Object;

    .line 173
    iput-object v0, p0, Lddr;->a:Lddq;

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lddr;->c:Z

    .line 176
    :cond_0
    return-void
.end method

.method public final c()Lddq;
    .locals 2

    .prologue
    .line 207
    invoke-direct {p0}, Lddr;->f()Lddq;

    move-result-object v0

    .line 208
    invoke-virtual {v0}, Lddq;->h()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1299
    new-instance v0, Ldej;

    invoke-direct {v0}, Ldej;-><init>()V

    .line 209
    throw v0

    .line 211
    :cond_0
    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 149
    invoke-direct {p0}, Lddr;->e()Lddr;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d()Ldea;
    .locals 1

    .prologue
    .line 149
    invoke-direct {p0}, Lddr;->f()Lddq;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    .line 180
    iget-object v0, p0, Lddr;->a:Lddq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lddq;->a(Lddq;Z)Z

    move-result v0

    return v0
.end method
