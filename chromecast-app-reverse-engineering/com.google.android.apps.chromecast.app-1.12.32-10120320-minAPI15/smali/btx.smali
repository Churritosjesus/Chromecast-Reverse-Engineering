.class final Lbtx;
.super Ljava/lang/Object;

# interfaces
.implements Lbb;


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Lorg/json/JSONObject;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbtx;->a:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lbtx;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
