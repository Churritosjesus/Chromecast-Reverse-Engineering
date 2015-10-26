.class final Lban;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbah;


# direct methods
.method constructor <init>(Lbah;)V
    .locals 0

    .prologue
    .line 444
    iput-object p1, p0, Lban;->a:Lbah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 448
    iget-object v0, p0, Lban;->a:Lbah;

    invoke-static {v0}, Lbah;->d(Lbah;)Landroid/support/v4/widget/DrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lban;->a:Lbah;

    invoke-static {v1}, Lbah;->b(Lbah;)Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->f(Landroid/view/View;)V

    .line 449
    return-void
.end method
