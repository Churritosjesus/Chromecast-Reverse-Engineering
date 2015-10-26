.class final Lbtv;
.super Ljava/lang/Object;

# interfaces
.implements Lbux;


# instance fields
.field private synthetic a:Lbtu;


# direct methods
.method constructor <init>(Lbtu;)V
    .locals 0

    iput-object p1, p0, Lbtv;->a:Lbtu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lbtv;->a:Lbtu;

    iget-object v1, p0, Lbtv;->a:Lbtu;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x837

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v1, v2}, Lbtu;->b(Lcom/google/android/gms/common/api/Status;)Lbb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbtu;->a(Lbwm;)V

    return-void
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p2, Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    check-cast p2, Lorg/json/JSONObject;

    :goto_0
    iget-object v0, p0, Lbtv;->a:Lbtu;

    new-instance v1, Lbtx;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, p2}, Lbtx;-><init>(Lcom/google/android/gms/common/api/Status;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lbtu;->a(Lbwm;)V

    return-void

    :cond_0
    move-object p2, v0

    goto :goto_0
.end method
