.class final Ldjq;
.super Ldju;
.source "PG"


# instance fields
.field private synthetic a:Ldjn;


# direct methods
.method constructor <init>(Ldjn;)V
    .locals 0

    .prologue
    .line 598
    iput-object p1, p0, Ldjq;->a:Ldjn;

    invoke-direct {p0}, Ldju;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 2

    .prologue
    .line 600
    iget-object v0, p0, Ldjq;->a:Ldjn;

    sget-object v1, Ldia;->h:Ldia;

    invoke-virtual {v0, v1}, Ldjn;->b(Ldia;)V

    .line 601
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 604
    invoke-virtual {p0}, Ldjq;->k_()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 605
    :cond_0
    return-void
.end method
