.class abstract Lbtu;
.super Lbua;


# instance fields
.field a:Lbux;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    invoke-direct {p0, p1}, Lbua;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    new-instance v0, Lbtv;

    invoke-direct {v0, p0}, Lbtv;-><init>(Lbtu;)V

    iput-object v0, p0, Lbtu;->a:Lbux;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/common/api/Status;)Lbwm;
    .locals 1

    invoke-virtual {p0, p1}, Lbtu;->b(Lcom/google/android/gms/common/api/Status;)Lbb;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/common/api/Status;)Lbb;
    .locals 1

    new-instance v0, Lbtw;

    invoke-direct {v0, p0, p1}, Lbtw;-><init>(Lbtu;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
