.class final Lcql;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lcqk;


# direct methods
.method constructor <init>(Lcqk;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcql;->a:Lcqk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 5

    .prologue
    .line 43
    check-cast p1, Lcpu;

    .line 1046
    iget-object v0, p0, Lcql;->a:Lcqk;

    .line 1054
    iget-object v1, v0, Lcqk;->c:Lcqj;

    invoke-interface {p1}, Lcpu;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    .line 1055
    invoke-interface {p1}, Lcpu;->c()Landroid/os/ParcelFileDescriptor;

    move-result-object v3

    const/4 v4, 0x0

    .line 1054
    invoke-static {v1, v2, v3, v0, v4}, Lcqj;->a(Lcqj;Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;Lcqq;I)V

    .line 43
    return-void
.end method
