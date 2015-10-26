.class public abstract Lddq;
.super Lddg;
.source "PG"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public h:Ldek;

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lddg;-><init>()V

    .line 39
    invoke-static {}, Ldek;->a()Ldek;

    move-result-object v0

    iput-object v0, p0, Lddq;->h:Ldek;

    .line 42
    const/4 v0, -0x1

    iput v0, p0, Lddq;->i:I

    .line 1164
    return-void
.end method

.method static a(Lddq;Lddn;Lddp;)Lddq;
    .locals 2

    .prologue
    .line 1149
    :try_start_0
    sget v0, Lddt;->b:I

    invoke-virtual {p0, v0, p1, p2}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lddq;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 1151
    :catch_0
    move-exception v0

    .line 1152
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lddx;

    if-eqz v1, :cond_0

    .line 1153
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lddx;

    throw v0

    .line 1155
    :cond_0
    throw v0
.end method

.method public static a(Ljava/util/List;)Lddw;
    .locals 1

    .prologue
    .line 1245
    new-instance v0, Ldef;

    invoke-direct {v0, p0}, Ldef;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method protected static final a(Lddq;Z)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1134
    sget v1, Lddt;->a:I

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 5129
    const/4 v3, 0x0

    invoke-virtual {p0, v1, v2, v3}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 1134
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 136
    invoke-virtual {p0, p1, v0, v0}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected final a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final a(Ldek;)V
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lddq;->h:Ldek;

    invoke-static {v0, p1}, Ldek;->a(Ldek;Ldek;)Ldek;

    move-result-object v0

    iput-object v0, p0, Lddq;->h:Ldek;

    .line 147
    return-void
.end method

.method public final f()Ldee;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    sget v0, Lddt;->h:I

    .line 2136
    invoke-virtual {p0, v0, v1, v1}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 46
    check-cast v0, Ldee;

    return-object v0
.end method

.method public final g()Lddr;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 56
    sget v0, Lddt;->f:I

    .line 3136
    invoke-virtual {p0, v0, v1, v1}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 56
    check-cast v0, Lddr;

    return-object v0
.end method

.method public final h()Z
    .locals 3

    .prologue
    .line 73
    sget v0, Lddt;->a:I

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4129
    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 73
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Lddr;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 77
    sget v0, Lddt;->f:I

    .line 4136
    invoke-virtual {p0, v0, v1, v1}, Lddq;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 77
    check-cast v0, Lddr;

    .line 78
    invoke-virtual {v0, p0}, Lddr;->a(Lddq;)Lddr;

    .line 79
    return-object v0
.end method

.method public final synthetic j()Ldeb;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lddq;->g()Lddr;

    move-result-object v0

    return-object v0
.end method

.method protected writeReplace()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1107
    new-instance v0, Lddu;

    invoke-direct {v0, p0}, Lddu;-><init>(Ldea;)V

    return-object v0
.end method
