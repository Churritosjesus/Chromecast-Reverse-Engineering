.class final Lbft;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 291
    .line 2294
    new-instance v0, Lbfs;

    invoke-direct {v0, p1}, Lbfs;-><init>(Landroid/os/Parcel;)V

    .line 291
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 291
    .line 1299
    new-array v0, p1, [Lbfs;

    .line 291
    return-object v0
.end method
