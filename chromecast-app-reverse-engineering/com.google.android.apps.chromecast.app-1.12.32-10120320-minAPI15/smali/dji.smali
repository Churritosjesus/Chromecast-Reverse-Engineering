.class final Ldji;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:Ldia;

.field private synthetic c:Ldjb;


# direct methods
.method varargs constructor <init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILdia;)V
    .locals 0

    .prologue
    .line 871
    iput-object p1, p0, Ldji;->c:Ldjb;

    iput p4, p0, Ldji;->a:I

    iput-object p5, p0, Ldji;->b:Ldia;

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 873
    iget-object v0, p0, Ldji;->c:Ldjb;

    invoke-static {v0}, Ldjb;->h(Ldjb;)Ldiv;

    move-result-object v0

    invoke-interface {v0}, Ldiv;->c()V

    .line 874
    iget-object v1, p0, Ldji;->c:Ldjb;

    monitor-enter v1

    .line 875
    :try_start_0
    iget-object v0, p0, Ldji;->c:Ldjb;

    invoke-static {v0}, Ldjb;->i(Ldjb;)Ljava/util/Set;

    move-result-object v0

    iget v2, p0, Ldji;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 876
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
