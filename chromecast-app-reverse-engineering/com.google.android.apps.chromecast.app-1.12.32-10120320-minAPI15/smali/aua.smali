.class final Laua;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Lauo;

.field private synthetic b:Latz;


# direct methods
.method constructor <init>(Latz;Lauo;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Laua;->b:Latz;

    iput-object p2, p0, Laua;->a:Lauo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 46
    check-cast p1, Ldbv;

    .line 1050
    if-eqz p1, :cond_1

    iget-object v0, p1, Ldbv;->b:Ldck;

    if-eqz v0, :cond_1

    iget-object v0, p1, Ldbv;->a:Ldcj;

    if-eqz v0, :cond_1

    .line 1053
    iget-object v0, p0, Laua;->b:Latz;

    iget-object v0, v0, Latz;->h:Lblp;

    .line 1054
    iget-object v0, p0, Laua;->b:Latz;

    .line 2053
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v0, Laun;->g:J

    .line 1056
    iget-object v0, p0, Laua;->b:Latz;

    new-instance v1, Lauq;

    iget-object v2, p1, Ldbv;->b:Ldck;

    invoke-direct {v1, v2}, Lauq;-><init>(Ldck;)V

    invoke-static {v0, v1}, Latz;->a(Latz;Lauq;)Lauq;

    .line 1057
    iget-object v0, p0, Laua;->b:Latz;

    new-instance v1, Laur;

    iget-object v2, p1, Ldbv;->a:Ldcj;

    invoke-direct {v1, v2}, Laur;-><init>(Ldcj;)V

    invoke-static {v0, v1}, Latz;->a(Latz;Laur;)Laur;

    .line 1059
    iget-object v0, p0, Laua;->b:Latz;

    iget-object v1, p1, Ldbv;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Latz;->a(Latz;J)J

    .line 1061
    iget-object v0, p0, Laua;->a:Lauo;

    if-eqz v0, :cond_0

    .line 1062
    iget-object v0, p0, Laua;->a:Lauo;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lauo;->a(Z)V

    :cond_0
    :goto_0
    return-void

    .line 1064
    :cond_1
    iget-object v0, p0, Laua;->a:Lauo;

    if-eqz v0, :cond_0

    .line 1065
    iget-object v0, p0, Laua;->a:Lauo;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lauo;->a(Z)V

    goto :goto_0
.end method
