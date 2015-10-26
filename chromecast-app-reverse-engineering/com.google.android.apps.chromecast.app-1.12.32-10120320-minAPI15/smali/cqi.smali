.class public final Lcqi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field private synthetic a:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;)V
    .locals 0

    .prologue
    .line 846
    iput-object p1, p0, Lcqi;->a:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    .prologue
    .line 849
    iget-object v0, p0, Lcqi;->a:Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    invoke-virtual {p2}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->a(Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;I)V

    .line 850
    return-object p2
.end method
