.class public final Laah;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field private synthetic a:Landroid/support/v7/widget/SearchView;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/SearchView;)V
    .locals 0

    .prologue
    .line 960
    iput-object p1, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 963
    iget-object v2, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-static {v2}, Landroid/support/v7/widget/SearchView;->o(Landroid/support/v7/widget/SearchView;)Landroid/app/SearchableInfo;

    move-result-object v2

    if-nez v2, :cond_1

    .line 993
    :cond_0
    :goto_0
    return v0

    .line 974
    :cond_1
    iget-object v2, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-static {v2}, Landroid/support/v7/widget/SearchView;->m(Landroid/support/v7/widget/SearchView;)Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->isPopupShowing()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-static {v2}, Landroid/support/v7/widget/SearchView;->m(Landroid/support/v7/widget/SearchView;)Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 976
    iget-object v0, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-static {v0, p1, p2, p3}, Landroid/support/v7/widget/SearchView;->a(Landroid/support/v7/widget/SearchView;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0

    .line 981
    :cond_2
    iget-object v2, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-static {v2}, Landroid/support/v7/widget/SearchView;->m(Landroid/support/v7/widget/SearchView;)Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a(Landroid/support/v7/widget/SearchView$SearchAutoComplete;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p3}, Lfi;->a(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 982
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-ne v2, v1, :cond_0

    .line 983
    const/16 v2, 0x42

    if-ne p2, v2, :cond_0

    .line 984
    invoke-virtual {p1}, Landroid/view/View;->cancelLongPress()V

    .line 987
    iget-object v2, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    const/4 v3, 0x0

    iget-object v4, p0, Laah;->a:Landroid/support/v7/widget/SearchView;

    invoke-static {v4}, Landroid/support/v7/widget/SearchView;->m(Landroid/support/v7/widget/SearchView;)Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v0, v3, v4}, Landroid/support/v7/widget/SearchView;->a(Landroid/support/v7/widget/SearchView;ILjava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 989
    goto :goto_0
.end method
