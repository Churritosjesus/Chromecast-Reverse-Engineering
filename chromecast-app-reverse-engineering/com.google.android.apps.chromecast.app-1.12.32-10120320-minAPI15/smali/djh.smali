.class final Ldjh;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:Ldjz;

.field private synthetic c:I

.field private synthetic d:Z

.field private synthetic e:Ldjb;


# direct methods
.method varargs constructor <init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILdjz;IZ)V
    .locals 0

    .prologue
    .line 854
    iput-object p1, p0, Ldjh;->e:Ldjb;

    iput p4, p0, Ldjh;->a:I

    iput-object p5, p0, Ldjh;->b:Ldjz;

    iput p6, p0, Ldjh;->c:I

    iput-boolean p7, p0, Ldjh;->d:Z

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 857
    :try_start_0
    iget-object v0, p0, Ldjh;->e:Ldjb;

    invoke-static {v0}, Ldjb;->h(Ldjb;)Ldiv;

    move-result-object v0

    iget-object v1, p0, Ldjh;->b:Ldjz;

    iget v2, p0, Ldjh;->c:I

    invoke-interface {v0, v1, v2}, Ldiv;->a(Ldkd;I)Z

    .line 858
    iget-object v0, p0, Ldjh;->e:Ldjb;

    iget-object v0, v0, Ldjb;->i:Ldid;

    iget v1, p0, Ldjh;->a:I

    sget-object v2, Ldia;->h:Ldia;

    invoke-interface {v0, v1, v2}, Ldid;->a(ILdia;)V

    .line 860
    iget-object v1, p0, Ldjh;->e:Ldjb;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 861
    :try_start_1
    iget-object v0, p0, Ldjh;->e:Ldjb;

    invoke-static {v0}, Ldjb;->i(Ldjb;)Ljava/util/Set;

    move-result-object v0

    iget v2, p0, Ldjh;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 862
    monitor-exit v1

    .line 866
    :goto_0
    return-void

    .line 862
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
