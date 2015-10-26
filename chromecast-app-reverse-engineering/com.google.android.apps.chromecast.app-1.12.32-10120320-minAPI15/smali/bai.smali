.class final Lbai;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwg;


# instance fields
.field private synthetic a:Lbah;


# direct methods
.method constructor <init>(Lbah;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lbai;->a:Lbah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 165
    iget-object v0, p0, Lbai;->a:Lbah;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbah;->a(Lbah;Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 166
    iget-object v0, p0, Lbai;->a:Lbah;

    invoke-static {v0}, Lbah;->b(Lbah;)Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/people/accountswitcherview/AccountSwitcherView;->b()V

    .line 167
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lbai;->a:Lbah;

    invoke-static {v0}, Lbah;->a(Lbah;)V

    .line 160
    return-void
.end method
