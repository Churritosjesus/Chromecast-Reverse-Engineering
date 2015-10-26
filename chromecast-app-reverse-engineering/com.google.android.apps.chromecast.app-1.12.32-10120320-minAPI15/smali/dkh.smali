.class public final Ldkh;
.super Ldkw;
.source "PG"


# instance fields
.field public a:Ldkw;


# direct methods
.method public constructor <init>(Ldkw;)V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ldkw;-><init>()V

    .line 26
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "delegate == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_0
    iput-object p1, p0, Ldkh;->a:Ldkw;

    .line 28
    return-void
.end method


# virtual methods
.method public final a(J)Ldkw;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0, p1, p2}, Ldkw;->a(J)Ldkw;

    move-result-object v0

    return-object v0
.end method

.method public final a(JLjava/util/concurrent/TimeUnit;)Ldkw;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0, p1, p2, p3}, Ldkw;->a(JLjava/util/concurrent/TimeUnit;)Ldkw;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0}, Ldkw;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Ldkw;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0}, Ldkw;->d()Ldkw;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0}, Ldkw;->f()V

    .line 71
    return-void
.end method

.method public final l_()J
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0}, Ldkw;->l_()J

    move-result-wide v0

    return-wide v0
.end method

.method public final m_()Z
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0}, Ldkw;->m_()Z

    move-result v0

    return v0
.end method

.method public final n_()Ldkw;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Ldkh;->a:Ldkw;

    invoke-virtual {v0}, Ldkw;->n_()Ldkw;

    move-result-object v0

    return-object v0
.end method
