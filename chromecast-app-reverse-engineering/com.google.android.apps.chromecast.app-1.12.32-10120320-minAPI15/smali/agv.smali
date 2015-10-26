.class final Lagv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 301
    .line 2305
    new-instance v0, Lagt;

    .line 3039
    invoke-direct {v0, p1}, Lagt;-><init>(Landroid/os/Parcel;)V

    .line 301
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 301
    .line 1310
    new-array v0, p1, [Lagt;

    .line 301
    return-object v0
.end method
