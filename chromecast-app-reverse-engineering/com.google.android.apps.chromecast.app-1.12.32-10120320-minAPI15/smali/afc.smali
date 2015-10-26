.class final Lafc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 590
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 590
    .line 2594
    new-instance v0, Lafb;

    invoke-direct {v0, p1}, Lafb;-><init>(Landroid/os/Parcel;)V

    .line 590
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 590
    .line 1599
    new-array v0, p1, [Lafb;

    .line 590
    return-object v0
.end method
