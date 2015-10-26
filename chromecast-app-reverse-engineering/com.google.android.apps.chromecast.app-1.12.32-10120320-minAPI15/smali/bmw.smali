.class final Lbmw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Laow;)V
    .locals 0

    .prologue
    .line 873
    iput-object p1, p0, Lbmw;->b:Lbmu;

    iput-object p2, p0, Lbmw;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 876
    iget-object v0, p0, Lbmw;->a:Laow;

    .line 1488
    invoke-virtual {v0}, Laow;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1489
    iput-boolean v2, v0, Laow;->m:Z

    .line 1490
    iget-object v1, v0, Laow;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Laow;->n:I

    .line 1491
    invoke-virtual {v0}, Laow;->p()V

    .line 877
    :cond_0
    iget-object v0, p0, Lbmw;->a:Laow;

    .line 1517
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 2439
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 1517
    invoke-virtual {v1, v0}, Lass;->a(Laow;)Laqj;

    move-result-object v1

    .line 1518
    if-eqz v1, :cond_1

    .line 1520
    invoke-virtual {v1}, Laqj;->g()V

    .line 878
    :goto_0
    iget-object v0, p0, Lbmw;->b:Lbmu;

    iget-object v1, p0, Lbmw;->a:Laow;

    .line 3069
    invoke-virtual {v0, v1}, Lbmu;->a(Laow;)V

    .line 879
    return-void

    .line 1522
    :cond_1
    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 1523
    invoke-virtual {v0}, Laow;->g()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    goto :goto_0
.end method
