.class final Lbkd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field private synthetic a:Lbkc;


# direct methods
.method constructor <init>(Lbkc;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lbkd;->a:Lbkc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .prologue
    .line 54
    iget-object v0, p0, Lbkd;->a:Lbkc;

    invoke-static {v0}, Lbkc;->a(Lbkc;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v0

    .line 55
    iget-object v1, p0, Lbkd;->a:Lbkc;

    .line 1559
    iget-object v1, v1, Lj;->m:Landroid/os/Bundle;

    .line 55
    const-string v2, "tutorialImageUrl"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v2

    const/4 v3, 0x0

    .line 57
    invoke-static {v3, v0, v1}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lbkd;->a:Lbkc;

    .line 56
    invoke-virtual {v2, v0, v1}, Latf;->a(Ljava/lang/String;Lats;)V

    .line 59
    const/4 v0, 0x1

    return v0
.end method
