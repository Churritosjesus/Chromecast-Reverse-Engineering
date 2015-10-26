.class public final Lazj;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Ljava/util/Timer;

.field final b:Lbdm;

.field final c:Lbdn;

.field public final d:J

.field private final e:Lblp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lbdm;)V
    .locals 2

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lblp;

    const-string v1, "SetupStateRefresher"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lazj;->e:Lblp;

    .line 29
    iput-object p2, p0, Lazj;->b:Lbdm;

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->fj:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lazj;->d:J

    .line 33
    new-instance v0, Lazk;

    invoke-direct {v0, p0}, Lazk;-><init>(Lazj;)V

    iput-object v0, p0, Lazj;->c:Lbdn;

    .line 45
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lazj;->a:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lazj;->a:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lazj;->a:Ljava/util/Timer;

    .line 64
    :cond_0
    return-void
.end method
