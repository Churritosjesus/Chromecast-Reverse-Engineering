.class final Lbbr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lbbn;


# direct methods
.method constructor <init>(Lbbn;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lbbr;->a:Lbbn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 194
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 1197
    new-array v0, v3, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1198
    iget-object v0, p0, Lbbr;->a:Lbbn;

    invoke-static {v0, v3}, Lbbn;->a(Lbbn;Z)V

    .line 194
    return-void
.end method
