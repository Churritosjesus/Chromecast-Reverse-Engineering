.class final Lab;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 390
    .line 2392
    new-instance v0, Laa;

    invoke-direct {v0, p1}, Laa;-><init>(Landroid/os/Parcel;)V

    .line 390
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 390
    .line 1396
    new-array v0, p1, [Laa;

    .line 390
    return-object v0
.end method
