.class final Lcqo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lcqn;


# direct methods
.method constructor <init>(Lcqn;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcqo;->a:Lcqn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 7

    .prologue
    .line 49
    check-cast p1, Lcpu;

    .line 1052
    iget-object v6, p0, Lcqo;->a:Lcqn;

    .line 1059
    iget-object v0, v6, Lcqn;->b:Lcqm;

    invoke-interface {p1}, Lcpu;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    .line 1060
    invoke-interface {p1}, Lcpu;->c()Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    invoke-interface {p1}, Lcpu;->d()I

    move-result v3

    invoke-interface {p1}, Lcpu;->e()I

    move-result v4

    iget v5, v6, Lcqn;->a:I

    .line 1059
    invoke-virtual/range {v0 .. v6}, Lcqm;->a(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;IIILcqq;)V

    .line 49
    return-void
.end method
