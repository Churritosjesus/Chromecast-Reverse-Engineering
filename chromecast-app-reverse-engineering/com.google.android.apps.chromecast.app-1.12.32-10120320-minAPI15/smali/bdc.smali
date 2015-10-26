.class final Lbdc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 100
    .line 2103
    new-instance v0, Lbdb;

    invoke-direct {v0, p1}, Lbdb;-><init>(Landroid/os/Parcel;)V

    .line 100
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 100
    .line 1108
    new-array v0, p1, [Lbdb;

    .line 100
    return-object v0
.end method
