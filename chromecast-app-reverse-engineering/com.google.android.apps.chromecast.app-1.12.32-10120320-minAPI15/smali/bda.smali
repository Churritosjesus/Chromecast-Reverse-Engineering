.class final Lbda;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 89
    .line 2092
    new-instance v0, Lbcz;

    invoke-direct {v0, p1}, Lbcz;-><init>(Landroid/os/Parcel;)V

    .line 89
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 89
    .line 1097
    new-array v0, p1, [Lbcz;

    .line 89
    return-object v0
.end method
