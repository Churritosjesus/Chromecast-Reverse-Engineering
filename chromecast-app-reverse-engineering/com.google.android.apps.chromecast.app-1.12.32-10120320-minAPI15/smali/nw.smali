.class final Lnw;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field e:Landroid/view/ViewGroup;

.field f:Landroid/view/View;

.field g:Landroid/view/View;

.field h:Lqa;

.field i:Lpy;

.field j:Landroid/content/Context;

.field k:Z

.field l:Z

.field m:Z

.field public n:Z

.field o:Z

.field p:Z

.field q:Landroid/os/Bundle;


# direct methods
.method constructor <init>(I)V
    .locals 1

    .prologue
    .line 1645
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1646
    iput p1, p0, Lnw;->a:I

    .line 1648
    const/4 v0, 0x0

    iput-boolean v0, p0, Lnw;->o:Z

    .line 1649
    return-void
.end method


# virtual methods
.method final a(Lqa;)V
    .locals 2

    .prologue
    .line 1701
    iget-object v0, p0, Lnw;->h:Lqa;

    if-ne p1, v0, :cond_1

    .line 1710
    :cond_0
    :goto_0
    return-void

    .line 1703
    :cond_1
    iget-object v0, p0, Lnw;->h:Lqa;

    if-eqz v0, :cond_2

    .line 1704
    iget-object v0, p0, Lnw;->h:Lqa;

    iget-object v1, p0, Lnw;->i:Lpy;

    invoke-virtual {v0, v1}, Lqa;->b(Lqp;)V

    .line 1706
    :cond_2
    iput-object p1, p0, Lnw;->h:Lqa;

    .line 1707
    if-eqz p1, :cond_0

    .line 1708
    iget-object v0, p0, Lnw;->i:Lpy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnw;->i:Lpy;

    invoke-virtual {p1, v0}, Lqa;->a(Lqp;)V

    goto :goto_0
.end method
