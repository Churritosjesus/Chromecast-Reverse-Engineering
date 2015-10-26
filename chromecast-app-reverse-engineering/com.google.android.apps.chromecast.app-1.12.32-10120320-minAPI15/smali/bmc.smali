.class final Lbmc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field private synthetic a:Landroid/view/View;

.field private synthetic b:Landroid/view/View$OnFocusChangeListener;

.field private synthetic c:Landroid/app/Activity;

.field private synthetic d:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/view/View$OnFocusChangeListener;Landroid/app/Activity;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 602
    iput-object p1, p0, Lbmc;->a:Landroid/view/View;

    iput-object p2, p0, Lbmc;->b:Landroid/view/View$OnFocusChangeListener;

    iput-object p3, p0, Lbmc;->c:Landroid/app/Activity;

    iput-object p4, p0, Lbmc;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 605
    if-eqz p2, :cond_0

    .line 606
    const/16 v0, 0x81

    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    invoke-virtual {v0}, Lapg;->b()V

    .line 608
    :cond_0
    iget-object v2, p0, Lbmc;->a:Landroid/view/View;

    if-eqz p2, :cond_2

    move v0, v1

    :goto_0
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 609
    iget-object v0, p0, Lbmc;->b:Landroid/view/View$OnFocusChangeListener;

    if-eqz v0, :cond_1

    .line 610
    iget-object v0, p0, Lbmc;->b:Landroid/view/View$OnFocusChangeListener;

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    .line 612
    :cond_1
    iget-object v0, p0, Lbmc;->c:Landroid/app/Activity;

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 614
    iget-object v2, p0, Lbmc;->d:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 615
    return-void

    .line 608
    :cond_2
    const/16 v0, 0x8

    goto :goto_0
.end method
