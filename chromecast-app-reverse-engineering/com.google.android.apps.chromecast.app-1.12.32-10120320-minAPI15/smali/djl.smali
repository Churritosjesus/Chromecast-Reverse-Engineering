.class final Ldjl;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:Ldjn;

.field private synthetic b:Ldjk;


# direct methods
.method varargs constructor <init>(Ldjk;Ljava/lang/String;[Ljava/lang/Object;Ldjn;)V
    .locals 0

    .prologue
    .line 644
    iput-object p1, p0, Ldjl;->b:Ldjk;

    iput-object p4, p0, Ldjl;->a:Ldjn;

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 647
    :try_start_0
    iget-object v0, p0, Ldjl;->b:Ldjk;

    iget-object v0, v0, Ldjk;->a:Ldjb;

    invoke-static {v0}, Ldjb;->f(Ldjb;)Ldiq;

    move-result-object v0

    iget-object v1, p0, Ldjl;->a:Ldjn;

    invoke-interface {v0, v1}, Ldiq;->a(Ldjn;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 655
    :goto_0
    return-void

    .line 648
    :catch_0
    move-exception v0

    .line 649
    sget-object v1, Ldgi;->a:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "StreamHandler failure for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ldjl;->b:Ldjk;

    iget-object v4, v4, Ldjk;->a:Ldjb;

    invoke-static {v4}, Ldjb;->a(Ldjb;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 651
    :try_start_1
    iget-object v0, p0, Ldjl;->a:Ldjn;

    sget-object v1, Ldia;->b:Ldia;

    invoke-virtual {v0, v1}, Ldjn;->a(Ldia;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 655
    :catch_1
    move-exception v0

    goto :goto_0
.end method
