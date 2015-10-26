.class final Lcjq;
.super Ljava/lang/Object;

# interfaces
.implements Lbvg;


# instance fields
.field private final a:Lcom/google/android/gms/cast/CastDevice;

.field private final b:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcjo;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcjq;->a:Lcom/google/android/gms/cast/CastDevice;

    iput-object p3, p0, Lcjq;->b:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    iget-object v0, p0, Lcjq;->a:Lcom/google/android/gms/cast/CastDevice;

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcjq;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
