.class final Ldr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 496
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 496
    .line 2499
    new-instance v0, Ldq;

    .line 3035
    invoke-direct {v0, p1}, Ldq;-><init>(Landroid/os/Parcel;)V

    .line 496
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 496
    .line 1504
    new-array v0, p1, [Ldq;

    .line 496
    return-object v0
.end method
